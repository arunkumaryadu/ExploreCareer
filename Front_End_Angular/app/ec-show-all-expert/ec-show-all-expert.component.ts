import { Component, OnInit } from '@angular/core';
import { ExpertService } from '../services/expert.service';

@Component({
  selector: 'app-ec-show-all-expert',
  templateUrl: './ec-show-all-expert.component.html',
  styleUrls: ['./ec-show-all-expert.component.css']
})
export class EcShowAllExpertComponent implements OnInit {

  experts: {};
  constructor(public rest:ExpertService) { this.get();}

  ngOnInit() {
  }
  
 get() {
   
    this.rest.getData().subscribe((data: {}) => {
     console.log(data);
      this.experts = data;
    });
}
}