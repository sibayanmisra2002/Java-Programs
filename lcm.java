



    int lcm = (n1 > n2) ? n1 : n2;
    for (int i = lcm; i <= n1 * n2; i += lcm) {
      if (i % n1 == 0 && i % n2 == 0) {
        lcm = i;
        break;
      }
    }
    System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm);
  }
}
