// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
angular.module('starter', ['ionic'])

.run(function($ionicPlatform) {
  $ionicPlatform.ready(function() {
    // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
    // for form inputs).
    // The reason we default this to hidden is that native apps don't usually show an accessory bar, at
    // least on iOS. It's a dead giveaway that an app is using a Web View. However, it's sometimes
    // useful especially with forms, though we would prefer giving the user a little more room
    // to interact with the app.
    if (window.cordova && window.Keyboard) {
      window.Keyboard.hideKeyboardAccessoryBar(true);
    }

    if (window.StatusBar) {
      // Set the statusbar to use the default style, tweak this to
      // remove the status bar on iOS or change it to use white instead of dark colors.
      StatusBar.styleDefault();
    }
  });
})

.config(function($stateProvider,  $urlRouterProvider) {
  $stateProvider
  .state('home', { url: "/home",  templateUrl: "home.html", controller: 'HomeCtrl' })
  .state('contacts', { url: "/contacts",  templateUrl: "contacts.html", controller: 'ContactsCtrl'})
   $urlRouterProvider.otherwise("/home");
})

.controller('HomeCtrl', function($scope) {

})
.controller('ContactsCtrl', function($scope) {

  $scope.contacts = [
    {"name": "Pedro Garcia", "phone": "634 34 54 22"},
    {"name": "Maria Martínez", "phone": "654 23 23 43"},
    {"name": "Luis González", "phone": "634 82 34 34"},
  ]


});
