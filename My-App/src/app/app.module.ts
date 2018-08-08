import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { Courses } from './courses.component';
import { StudentComponent } from './student/student.component';
import { CourseService } from './courses.service';


@NgModule({
  declarations: [
    AppComponent,
    Courses,
    StudentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [ CourseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
