#include <stdio.h>
#include <unistd.h>
int main() {
    int n;
    int id = fork();

    if (id == 0) {  // Child process
        n = 0;
    } else {        // Parent process
        n = 6;
        wait(NULL);  // Wait for child to finish (optional for deterministic output)
    }

    for (int i = n; i < n + 5; i++) {
        printf("%d\n", i);  // Add newline character for readability
    }
printf("current ID %d,\t parent ID %d \n", getpid(),getppid());
    return 0;
    printf("1 to 5 are child process");
    printf("6 to 10 are child process");
    
}
