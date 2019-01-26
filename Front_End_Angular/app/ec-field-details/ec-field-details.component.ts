import { Component, OnInit } from '@angular/core';
import { EcFieldDetailsServiceService }  from '../services/ec-field-details-service.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-ec-field-details',
  templateUrl: './ec-field-details.component.html',
  styleUrls: ['./ec-field-details.component.css']
})
export class EcFieldDetailsComponent implements OnInit {

  products:any = [];

  constructor(public rest:EcFieldDetailsServiceService, private route: ActivatedRoute, private router: Router) { }
 
  ngOnInit() {
     this.getProducts();
    //  this.rest.getProduct(this.route.snapshot.params['id']).subscribe((data: {}) => {
    //    console.log(data);
    //    this.product = data;
     //});
  
   }
 
   getProducts() {
   // this.products = [];
    this.rest.getProducts().subscribe((data: {}) => {
      console.log(data);
      this.products = data;
    });
  }
 }
