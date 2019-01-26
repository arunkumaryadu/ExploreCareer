import { Component, OnInit } from '@angular/core';
import { StreamService } from 'src/app/services/stream.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-ec-single-stream-details',
  templateUrl: './ec-single-stream-details.component.html',
  styleUrls: ['./ec-single-stream-details.component.css']
})
export class EcSingleStreamDetailsComponent implements OnInit {
hero;
  constructor(
    private route: ActivatedRoute,
    public  rest:StreamService,
    private location: Location
  ) {}
 
  ngOnInit(): void {
   // this.getHero();
   console.log(5);
   
  }
 
  getHero(): void {
    const id = +this.route.snapshot.paramMap.get('id');
      this.rest.getData().subscribe((data: {}) => {
        console.log(data);
         this.hero = data;
       });
  }
 
  goBack(): void {
    //this.location.back();
  }

}
