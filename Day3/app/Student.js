"use strict";
exports.__esModule = true;
var Student = /** @class */ (function () {
    function Student(id, name, status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    Student.prototype.getId = function () {
        return this.id;
    };
    Student.prototype.getName = function () {
        return this.name;
    };
    Student.prototype.getStatus = function () {
        return this.status;
    };
    return Student;
}());
exports.Student = Student;
