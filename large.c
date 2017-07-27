  #include <stdio.h>

  int main() {
        int n, large = 0, rem = 0;

        printf("Enter your input value:");
        scanf("%d", &n);

        while (n > 0) {
                rem = n % 10;

                if (rem > large) {
                        large = rem;
                }

                n = n / 10;
        }

        printf("Largest digit of the number is %d\n", large);
        return 0;
  }
