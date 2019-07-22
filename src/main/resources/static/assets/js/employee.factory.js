var app = angular.module("Employees");

app.factory("EmployeesFactory",["$resource",function($resource) {
    return $resource('employee/:id');
}]);