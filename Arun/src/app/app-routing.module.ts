// inbuild
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

// my component
import { EcFieldDisplayAllComponent }      from './ec-field-display-all/ec-field-display-all.component';
import { EcHomeComponent }      from './ec-home/ec-home.component';


const routes: Routes = [
  { path: '', redirectTo: '/Home', pathMatch: 'full' },
    { path: 'Home', component: EcHomeComponent },
  { path: 'CareerIn', component: EcFieldDisplayAllComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
