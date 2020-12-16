#include <iostream>
#include <string>
#include <vector>

long long get_fibonacci_huge_naive(long long n, long long m)
{
	if (n <= 1)
		return n;

	long long previous = 0;
	long long current = 1;

	for (long long i = 0; i < n - 1; ++i)
	{
		long long tmp_previous = previous;
		previous = current;
		current = tmp_previous + current;
	}

	return current % m;
}

long long get_fibonacci_huge_fast(long long n, long long m)
{
	long long prev = 0;
	long long current = 1;

	std::vector<int> periods;
	periods.push_back(0);
	periods.push_back(1);
	for (int i = 0; i < m * m; ++i)
	{

		long long temp = prev;
		prev = current;
		current = (temp + prev) % m;

		if (prev == 0 && current == 1)
		{
			periods.pop_back();
			break;
		}

		periods.push_back(current);
	}

	return periods[n % periods.size()];
}

int main()
{
	long long n, m;
	std::cin >> n >> m;
	std::cout << get_fibonacci_huge_fast(n, m) << '\n';
}
