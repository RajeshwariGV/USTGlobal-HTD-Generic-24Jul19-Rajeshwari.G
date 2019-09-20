import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './users/users.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    RegisterComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: '',component:HomeComponent},
      {path:'header', component: HeaderComponent},
      {path:'about', component: AboutComponent},
      {path:'register',component:RegisterComponent},
      {path:'users',component:UsersComponent}
      
    ]),
    HttpClientModule,
    FormsModule,   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
