require('./vendor');
require('./styles');

var appModule = require('../index');

if (MODE.production) {
    require('./config/production').default(appModule);
}

// angular.element(document).ready(() => {
//     angular.bootstrap(document, [appModule.name], {
//         // strictDi: true
//     });
// });