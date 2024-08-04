#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
void main(){
    int id = fork();
    if(id==0){
        printf("IM child process imma sleep now for 2 seconds");
    sleep(2);
    printf("the kid is woke now");
    }
else{
    printf("Hi I am daddy");
    wait(2);
    printf("Done waiting now imma sleep for 3s");
    sleep(3);
}
}