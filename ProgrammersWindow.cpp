#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> wallpaper) {
    vector<int> answer;
    int minY = 50;
	int minX = 50;
	int maxY = 0;
	int maxX = 0;
	int y = 0;
	int x = 0;
	for (string a : wallpaper) {	
		for (auto b : a) {
			if (b == '#') {
				if ( y >= maxY ) maxY = y;
				if ( x >= maxX ) maxX = x;
				if ( y <= minY ) minY = y;
				if ( x <= minX ) minX = x;
			}
			x++;
		}
        x = 0;
		y++;
	}
    answer.push_back(minY);
    answer.push_back(minX);
    answer.push_back(maxY + 1);
    answer.push_back(maxX + 1);
    return answer;
}
//source: https://school.programmers.co.kr/learn/challenges
