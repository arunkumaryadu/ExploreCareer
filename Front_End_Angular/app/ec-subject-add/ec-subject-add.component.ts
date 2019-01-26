import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import{FormGroup,FormControl} from '@angular/forms'

import { SubjectService } from '../services/subject.service';

@Component({
  selector: 'app-ec-subject-add',
  templateUrl: './ec-subject-add.component.html',
  styleUrls: ['./ec-subject-add.component.css']
})
export class EcSubjectAddComponent implements OnInit {

//  @Input()

   constructor(public rest:SubjectService, private route: ActivatedRoute, private router: Router) { }
form;
   ngOnInit(){
   this.form = new FormGroup({
   name: new FormControl(''),
   details: new FormControl('')});

   }
   onSubmit(sub){
   console.log(sub);
   this.rest.addSubject(sub).subscribe((result) => {
    console.log(result);
   }, (err) => {
     console.log(err);
   });
   }
}
