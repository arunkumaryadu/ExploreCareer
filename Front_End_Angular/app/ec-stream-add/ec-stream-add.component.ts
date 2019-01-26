import { Component, OnInit, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormBuilder, FormGroup, FormArray, FormControl, ValidatorFn } from '@angular/forms';
import { SubjectService } from '../services/subject.service';
import { StreamService } from '../services/stream.service';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-ec-stream-add',
  templateUrl: './ec-stream-add.component.html',
  styleUrls: ['./ec-stream-add.component.css'],
  
})

export class EcStreamAddComponent implements OnInit {
  finalObj={link:null,streamName:null,scope:null,subject:[{subjectCode:1,name:null,details:null},{subjectCode:1,name:null,details:null}]};
  form: FormGroup;
  
  subjects:any = [
 
    {subjectCode:1, name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
    { subjectCode:1,name: 'subject not available', details: 'subject 1' },
   
    { subjectCode:1,name: 'subject not available', details: 'subject 1' }
   
  ];

  constructor(private formBuilder: FormBuilder,public  subrest:SubjectService,public  rest:StreamService) {
    // Create a new array with a form control for each order
    this.getSubjects();
    const controls = this.subjects.map(c => new FormControl(false));
    //controls[0].setValue(true); // Set the first checkbox to true (checked)

    this.form = this.formBuilder.group({
      name: new FormControl(''),
      link: new FormControl(''),
      scope: new FormControl(''),
      subjects: new FormArray(controls)
    });

  
   
  }
  ngOnInit(){
    
  }

  submit() {
    const selectedSubjects = this.form.value.subjects
      .map((v, i) => v ? this.subjects[i].subjectCode || this.subjects[i].name ||this.subjects[i].details: null)
      .filter(v => v !== null);
this.finalObj.link=this.form.value.link;
this.finalObj.scope=this.form.value.scope;
this.finalObj.streamName=this.form.value.name;
//console.log(selectedSubjects[]);

for (let index = 0; index < 2; index++) {
  
  this.finalObj.subject[index].subjectCode=selectedSubjects[index].subjectCode;
  this.finalObj.subject[index].name=selectedSubjects[index].name;
  this.finalObj.subject[index].details=selectedSubjects[index].details;
}

    console.log(selectedSubjects);
   console.log("hello00");
    console.log(this.finalObj);
    this.rest.addStream(this.finalObj).subscribe((result) => {
      console.log(result);
     }, (err) => {
       console.log(err);
     });
  }
  getSubjects() {
   
    this.subrest.getSubjects().subscribe((data: {}) => {
     console.log(data);
      this.subjects = data;
    });
  }

}


