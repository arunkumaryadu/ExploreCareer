import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import{FormGroup,FormControl, FormBuilder, FormArray} from '@angular/forms'

import { FieldService } from '../services/field.service';
import { EcFieldDetailsServiceService } from '../services/ec-field-details-service.service';
import { StreamService } from '../services/stream.service';

@Component({
  selector: 'app-ec-field-add',
  templateUrl: './ec-field-add.component.html',
  styleUrls: ['./ec-field-add.component.css']
})
export class EcFieldAddComponent implements OnInit {
finalObj={details1:null,details2:null,link:null,fieldName:null,
  stream:[
    {streamName:null,link:'null',scope:'null'},
    {streamName:null,link:'null',scope:'null'},
    {streamName:null,link:'null',scope:'null'}
  ],
  branch:[
    {branchName:null,details1:'null',details2:'null'},
    {branchName:null,details1:'null',details2:'null'},
    {branchName:null,details1:'null',details2:'null'},
    {branchName:null,details1:'null',details2:'null'},
    {branchName:null,details1:'null',details2:'null'}
  ]
};
form: FormGroup;
streams:any = [

  { name: 'stream not available', scope: 'scope' ,link:'link'},
  { name: 'stream not available', scope: 'scope' ,link:'link'},
  { name: 'stream not available', scope: 'scope' ,link:'link'}
 ];
 branches:any=[
  { name: 'branch not available', details1: 'details1' ,details2:'details1'},
  { name: 'branch not available', details1: 'details1' ,details2:'details1'},
  { name: 'branch not available', details1: 'details1' ,details2:'details1'},
  { name: 'branch not available', details1: 'details1' ,details2:'details1'}
 ];

constructor(private formBuilder: FormBuilder,public  subrest:FieldService,public  rest:StreamService) {
  // Create a new array with a form control for each order
  this.getData();
  const controls = this.streams.map(c => new FormControl(false));
    //controls[0].setValue(true); // Set the first checkbox to true (checked)

    this.form = this.formBuilder.group({
      name: new FormControl(''),
      link: new FormControl(''),
      details1: new FormControl(''),
      details2: new FormControl(''),
      streams: new FormArray(controls)
    });



 
}
ngOnInit(){
  
}
submit() {
  const selectedStreams = this.form.value.streams
    .map((v, i) => v ? this.streams[i].streamName : null)
    .filter(v => v !== null);
    const selectedBranch = this.form.value.streams
    .map((v, i) => v ? this.branches[i].branchName : null)
    .filter(v => v !== null);
this.finalObj.fieldName=this.form.value.name;
this.finalObj.link=this.form.value.link;
this.finalObj.details1=this.form.value.detail1;
this.finalObj.details2=this.form.value.detail2;
//console.log(selectedSubjects[]);
console.log(this.form.value);


for (let index = 0; index < 3; index++) {

this.finalObj.stream[index].streamName=selectedStreams[index];
}
for (let index = 0; index < 5; index++) {

  this.finalObj.branch[index].branchName=selectedBranch[index];
  }
  console.log(selectedStreams);
  console.log(selectedBranch);
  console.log(this.finalObj);
  this.subrest.addField(this.finalObj).subscribe((result) => {
    console.log(result);
   }, (err) => {
     console.log(err);
   });
}
getBranch() {
 
  this.subrest.getBranch().subscribe((data: {}) => {
   console.log(data);
    this.branches = data;
  });
}

getData() {
 
  this.rest.getData().subscribe((data: {}) => {
   console.log(data);
    this.streams = data;
  });
}

}
