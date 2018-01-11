
public class Primes {
	
	private int count;
	
	public Primes () {
		count = 0;
	}
	
	public boolean isPrime(int prime) {
		if (prime == 1) {
			return true;
		}
		else if (prime > 1) {
			for(int i = 1; i <= prime; i++) {
				if (prime / i != 1 && prime % i == 0) {
					count++;
				}
				if(count > 1) {
					break;
				}
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
	
	public String toString (boolean isPrime, int prime) {
		String primeStr = "";
		if(isPrime == true) {
			primeStr = Integer.toString(prime) + " is prime.";
		}
		else {
			primeStr = Integer.toString(prime) + " is not prime.";
		}
		return primeStr;
	}
	
	public static void main (String[] args) {
		int prime = 5;
		Primes primes = new Primes();
		System.out.println(primes.toString(primes.isPrime(prime), prime));
	}

}
