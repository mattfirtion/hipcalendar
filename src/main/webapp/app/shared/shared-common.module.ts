import { NgModule } from '@angular/core';
import { Title } from '@angular/platform-browser';

import {
    CalendarSharedLibsModule,
    JhiAlertComponent,
    JhiAlertErrorComponent
} from './';

@NgModule({
    imports: [
        CalendarSharedLibsModule
    ],
    declarations: [
        JhiAlertComponent,
        JhiAlertErrorComponent
    ],
    providers: [
        Title
    ],
    exports: [
        CalendarSharedLibsModule,
        JhiAlertComponent,
        JhiAlertErrorComponent
    ]
})
export class CalendarSharedCommonModule {}
