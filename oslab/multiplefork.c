#include<stdio.h>
#include<unistd.h>
void main(){
    int id1=fork();
    int id2=fork();
    if (id1==0)
    {
        if (id2==0)
        {
            printf("I am pehle bache ka bacha");
        }
        else{
            printf("I am pehle bacha");
        }
        if (id2==0)
        {
            printf("i am dusra bacha");
        }
        else
        {
            printf("Mai toh PAPA hoon");
        }
        
        
    }
    
}
