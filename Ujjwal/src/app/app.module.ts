import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EcAskQuestionComponent } from './ec-ask-question/ec-ask-question.component';
import { RouterModule } from '@angular/router';
import { EcAddExpertComponent } from './ec-add-expert/ec-add-expert.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    EcAskQuestionComponent,
    EcAddExpertComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule ,
    RouterModule.forRoot([
      {
        
         path: 'b',
         component: EcAddExpertComponent
         
      }
   ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
