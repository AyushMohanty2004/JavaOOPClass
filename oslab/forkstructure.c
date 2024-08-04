#include<stdio.h>
#include<unistd.h>
void createfun(int level){
        if (level==0)
        {
            printf("there are no child processes");
        }
        int id = fork();
        if (id == -1)
        {
            printf("Exit");
        }
        if(id != 0){
         wait();
        }
        printf("Level %d\t PID %d\t", level,getpid());
        createfun(level-1);
}
int main(){
    int level;
    printf("Enter numbe of levels");
    scanf("%d",&level);
createfun(level);    
}
