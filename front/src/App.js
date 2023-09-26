import './App.css';
import React, { useState } from 'react';
import Sidebar from './component/Sidebar'

function App() {
  const [showLoginModal, setShowLoginModal] = useState(false);

  const handleLoginClick = () => {
    setShowLoginModal(true);
  }

  const handleModalClose = () => {
    setShowLoginModal(false);
  }

  const thisYear = () => {
    const year = new Date().getFullYear();
    return year;
  }

  const Header = () => {
    const [isOpen, setMenu] = useState(false);  // 메뉴 초기값 false set
    const toggleMenu = () => {
      setMenu(isOpen => !isOpen);   // boolean으로 on/off 
    }

  }

  return (
    <div class="full">
      <div className="app">
        <header>
        </header>
        <body>
          <div class="container">
            <div id='column' class='symbol'>배너
<<<<<<< HEAD
            </div>
=======
              <nav>
                <ul className="header-wrapper">
                  <li><a href="https://www.skuniv.ac.kr/main">학교 홈페이지 바로가기</a></li>
                  <li><a href="https://www.skuniv.ac.kr/notice">학교 공지사항 바로가기</a></li>
                  <li><a href="https://www.skuniv.ac.kr/academic_calendar">학사일정 바로가기</a></li>
                  <li><a href="#"><input type="text" name="search" placeholder="검색어를 입력하세요" autoComplete='off' /></a></li>
                </ul>
              </nav></div>
>>>>>>> a7c126fb702e7c15b6230cd6ae1685d0e1d13781
            <div id='column'>
              <div id='column2'>로그인<br />
                <input type="text" id='id' value='ID 입력' />
                <input type="password" id='pw' value="PW 입력" />
                <button onClick={handleLoginClick}>로그인</button>
              </div>
              <div id='column2'>공지사항</div>
            </div>
            <div id='column'>시간표</div>
<<<<<<< HEAD
            <div>
            <nav>
                <ul className="header-wrapper">
                  <li><a href="https://www.skuniv.ac.kr/main">학교 홈페이지 바로가기</a></li>
                  <li><a href="https://www.skuniv.ac.kr/notice">학교 공지사항 바로가기</a></li>
                  <li><a href="https://www.skuniv.ac.kr/academic_calendar">학사일정 바로가기</a></li>
                  <li><a href="#"><input type="text" name="search" placeholder="검색어를 입력하세요" autoComplete='off' /></a></li>
                </ul>
              </nav>
            </div>
          </div>
          <Sidebar width={320}></Sidebar>
          <div class="refe">
            <a href="https://www.skuniv.ac.kr/main"><span>학교 홈페이지</span></a>
            <a href="https://www.skuniv.ac.kr/notice"><span>학교 공지사항</span></a>
            <a href="https://www.skuniv.ac.kr/academic_calendar"><span>학사일정</span></a>
            <a href="https://www.skuniv.ac.kr/phone"><span>교내 연락처</span></a>
          </div>
        </body>
        <footer>
          명Kay검진 &copy; <span>{thisYear()}</span>

=======
          </div>
          <Sidebar width={320}></Sidebar>
        </body>
        <div>
            문의 이메일 : gksrbgks713@skuniv.ac.kr
        </div>
        <footer>
          명Kay검진 &copy; <span>{thisYear()}</span>
>>>>>>> a7c126fb702e7c15b6230cd6ae1685d0e1d13781
        </footer>

      </div>
    </div>
  );
}

export default App;