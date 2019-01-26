import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ExpertService } from '../services/expert.service';

import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ec-add-expert',
  templateUrl: './ec-add-expert.component.html',
  styleUrls: ['./ec-add-expert.component.css']
})
export class EcAddExpertComponent implements OnInit {

  formdata;
  constructor(public rest:ExpertService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() { 
    this.formdata=new FormGroup(
    {
      userName:new FormControl(''),
      passWord:new FormControl(''),
      emailId:new FormControl(''),
      phoneNumber:new FormControl(''),
      expertIn:new FormControl(''),
      expertSalary:new FormControl('')
    }
  );
  }
  onSubmit(ExpertDetail){
    console.log(ExpertDetail);
    this.rest.addExpert(ExpertDetail).subscribe((result) => {
      console.log(result);
    }, (err) => {
      console.log(err);
    });
}
}




// onSubmit(sub){
//   console.log(sub);
//   this.rest.addSubject(sub).subscribe((result) => {
//    console.log(result);
//   }, (err) => {
//     console.log(err);
//   });
//   }
