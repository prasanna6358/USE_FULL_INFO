
import { Component } from "@angular/core";
import { CourseService } from "./courses.service";

@Component({
    selector:'courses',
    template:`
    <h2>{{ title }}</h2>
    <ul>
    <li *ngFor="let course of _courses">{{ course }}</li>
    </ul>
    <hr>
    <ul>
    <li *ngFor="let course of newCourses">{{ course }}</li>
    </ul>
    
    `
})

export class Courses{
    title = 'List of Courses';
    _courses = ["java",".Net","Python","Scala"];
    newCourses;
    _emails;

    constructor(service :CourseService){
        this.newCourses = service.getCourses();
        this._emails = service.getEmails() 
    }
}