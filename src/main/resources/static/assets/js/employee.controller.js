var app = angular.module("Employees");

app.controller("EmployeesController",["$scope","$window", "EmployeesFactory", function($scope, $window, EmployeesFactory){
    
    $scope.list;
    $scope.employee;
    
    EmployeesFactory.query(function(data){
        $scope.list = data;
    });

    $scope.save = function () {
        EmployeesFactory.save($scope.employee, function(){
            $window.location.reload();
        });
    }

    $scope.delete = function (id) {
        EmployeesFactory.delete({id:id}, function(){
            $window.location.reload();
        });
    }
}]);