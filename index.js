'use strict';

var fs = require('fs');
var glob = require('glob');
var vm = require('vm');

var files = glob.sync('./target/*/*opt.js');
if (files.length === 0) {
  throw new Error('Not found script.');
}
var code = fs.readFileSync(files[0]);
var context = vm.createContext({
  global: global,
  console: console
});
vm.runInContext(code, context);

module.exports = new context.MyList;