export default angular.module('app', ['lumx', require('./core/layout').default.name]);

function printMessage (status='working') {
    let message = 'ES6';
    console.log(`${message} is ${status}`);
}
printMessage();