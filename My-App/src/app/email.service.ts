import { Injectable } from '@angular/core';
import { CourseService } from './courses.service';

@Injectable()
export class EmailService {
  emails;
  constructor(_email :CourseService) { 
    this.emails = _email.getEmails();
  }
  getEmail(){
    return  ["prasanna@gmail.com","billa@gmail.com","kumar@gmail.com","sukumar@gmil.com","kittu@gmail.com"];
  }
}
