```
 _        _                         _       _     _
| |_ __ _| | ___| |____      ____ _| |__   ( )___  _ __   ___ | |_ ___
| __/ _` / _ \ '_ \ \ /\ / / _` | '_ \ |/ __| | '_ \ / _ \| __/ _ \
| || (_| |  __/ | | \ V  V / (_| | | | |  \__ \ | | | | (_) | ||  __/
 \__\__,_|\___|_| |_|\_/\_/ \__,_|_| |_|  |___/ |_| |_|\___/ \__\___|

 $ whoami → 공부하는 개발자
 $ theme  → hacker-terminal (tokyo night)
```

<p align="center">
  <a href="https://taehwanis.github.io"><strong>taehwan@blog:~$ open site ↗</strong></a>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Jekyll-CC0000?style=flat-square&logo=jekyll&logoColor=white" alt="Jekyll">
  <img src="https://img.shields.io/badge/GitHub%20Pages-222?style=flat-square&logo=github&logoColor=white" alt="GitHub Pages">
  <img src="https://img.shields.io/badge/theme-terminal-1a1b26?style=flat-square" alt="Terminal Theme">
  <img src="https://img.shields.io/badge/palette-Tokyo%20Night-7aa2f7?style=flat-square" alt="Tokyo Night">
</p>

---

## `$ cat about.txt`

알고리즘 문제 풀이와 개발 학습 과정을 기록하는 개인 블로그입니다.

[Minimal Mistakes](https://github.com/mmistakes/minimal-mistakes) Jekyll 테마를 기반으로, **Hacker Terminal** 스타일의 커스텀 테마를 적용했습니다.

## `$ ls features/`

```
drwxr-xr-x  terminal-theme/
  ├── tokyo-night-palette     # 다크 배경 + 컬러 코드 하이라이팅
  ├── fira-code-font          # 모노스페이스 전체 적용
  ├── titlebar-dots           # 🔴🟡🟢 터미널 타이틀바
  ├── prompt-style-nav        # ~ home  # tags  @ categories
  ├── blinking-cursor         # █ 깜빡이는 커서
  ├── command-not-found-404   # bash: /path: command not found
  └── exit-0-footer           # [exit 0] session ended

drwxr-xr-x  blog-features/
  ├── giscus-comments         # GitHub Discussions 기반 댓글
  ├── code-copy-button        # 코드 블록 복사 버튼
  ├── full-text-search        # Lunr 전문 검색
  ├── toc-sticky              # 목차 고정 사이드바
  ├── responsive-mobile       # 모바일 반응형
  └── seo-optimized           # sitemap, robots.txt, Open Graph
```

## `$ cat tech-stack.yml`

```yaml
framework: Jekyll
theme: Minimal Mistakes (forked)
skin: terminal (custom)
hosting: GitHub Pages
font: Fira Code
palette: Tokyo Night
comments: giscus
search: Lunr
```

## `$ cat color-palette.txt`

```
Background    #1a1b26  ████████
Surface       #24283b  ████████
Border        #2a2e42  ████████
Text          #a9b1d6  ████████
Bright Text   #c0caf5  ████████
Muted         #565f89  ████████
Blue          #7aa2f7  ████████
Green         #9ece6a  ████████
Red           #f7768e  ████████
Yellow        #e0af68  ████████
Purple        #bb9af7  ████████
Cyan          #7dcfff  ████████
```

## `$ ./run-local.sh`

```bash
# Prerequisites
gem install bundler jekyll

# Install dependencies
bundle install

# Serve locally
bundle exec jekyll serve

# Open browser
open http://localhost:4000
```

## `$ tree _posts/ | wc -l`

55개의 프로그래머스 알고리즘 풀이 포스트 (Java, Python, JavaScript)

## `$ cat LICENSE`

Based on [Minimal Mistakes](https://github.com/mmistakes/minimal-mistakes) by Michael Rose.

MIT License — see [LICENSE](LICENSE) for details.

---

<p align="center">
  <sub><code>taehwan@blog:~$ exit 0</code></sub>
</p>
