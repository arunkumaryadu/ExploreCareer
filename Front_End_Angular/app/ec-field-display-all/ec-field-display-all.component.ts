import { Component, OnInit } from '@angular/core';
import { EcFieldServiceService }  from '../services/ec-field-service.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-ec-field-display-all',
  templateUrl: './ec-field-display-all.component.html',
  styleUrls: ['./ec-field-display-all.component.css']
})
export class EcFieldDisplayAllComponent implements OnInit {

  products:any = [

    { name: 'stream not available', scope: 'scope' ,link:'link'},
    { name: 'stream not available', scope: 'scope' ,link:'link'},
    { name: 'stream not available', scope: 'scope' ,link:'link'}
   ];

 constructor(public rest:EcFieldServiceService, private route: ActivatedRoute, private router: Router) { }

 ngOnInit() {
    this.getProducts();
  /*  this.rest.getProduct(this.route.snapshot.params['id']).subscribe((data: {}) => {
      console.log(data);
      this.products = data;
    });*/

  }

  getProducts() {
   this.products = [];
   this.rest.getProducts().subscribe((data: {}) => {
     console.log(data);
     this.products = data;
   });
 }
}
