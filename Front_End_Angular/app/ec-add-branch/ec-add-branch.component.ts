import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl ,Validators} from '@angular/forms';
import {BranchService } from '../services/branch.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-ec-add-branch',
  templateUrl: './ec-add-branch.component.html',
  styleUrls: ['./ec-add-branch.component.css']
})
export class EcAddBranchComponent implements OnInit {

  constructor(public rest:BranchService, private route: ActivatedRoute, private router: Router) { }

  form;

  ngOnInit() {
    this.form = new FormGroup({
      name : new FormControl('',Validators.compose([
        Validators.required,
        Validators.pattern('[\\w\\-\\s\\/]+')])),
     details1: new FormControl('', Validators.required),
     details2: new FormControl('', Validators.required)
     
  });

}



onSubmit(addedbranch){
  console.log(addedbranch);
  this.rest.addbranch(addedbranch).subscribe((result) => {
    console.log(result);
   }, (err) => {
     console.log(err);
  }
  );
}

}
