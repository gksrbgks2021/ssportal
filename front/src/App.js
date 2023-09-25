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
  const timeSlots = [
    '09-10',
    '10-11',
    '11-12',
    '12-13',
    '13-14',
    '14-15',
    '15-16',
    '16-17',
    '17-18'
  ];

  // 초기 시간표 데이터 (빈 과목 배열)
  const initialTimetable = timeSlots.map((slot) => ({
    time: slot,
    subject: '',
  }));

  // 시간표 데이터를 state로 관리
  const [timetable, setTimetable] = useState(initialTimetable);

  // 과목 색상 매핑
  const subjectColors = {
    '수학': 'red',
    '과학': 'blue',
    '영어': 'green',
    // 추가 과목 및 색상을 여기에 추가할 수 있습니다.
  };

  // 과목을 선택하여 해당 시간대에 색상을 지정
  const handleSubjectSelection = (index) => {
    const selectedSubject = prompt('과목을 입력하세요:');
    if (selectedSubject) {
      const updatedTimetable = [...timetable];
      updatedTimetable[index].subject = selectedSubject;
      setTimetable(updatedTimetable);
    }
  };

  return (
    <div class="full">
      <div className="app">
        <header>
        </header>
        <body>
          <div class="container">
            <div id='column' class='symbol'>배너
              <nav>
                <ul className="header-wrapper">
                  <li><a href="https://www.skuniv.ac.kr/main">학교 홈페이지 바로가기</a></li>
                  <li><a href="https://www.skuniv.ac.kr/notice">학교 공지사항 바로가기</a></li>
                  <li><a href="https://www.skuniv.ac.kr/academic_calendar">학사일정 바로가기</a></li>
                  <li><a href="#"><input type="text" name="search" placeholder="검색어를 입력하세요" autoComplete='off' /></a></li>
                </ul>
              </nav></div>
            <div id='column'>
              <div id='column2'>로그인<br />
                <input type="text" id='id' value='ID 입력' />
                <input type="password" id='pw' value="PW 입력" />
                <button onClick={handleLoginClick}>로그인</button>
              </div>
              <div id='column2'>공지사항</div>
            </div>
            <div id='column'>
            <h1>시간표</h1>
      <table>
        <thead>
          <tr>
            <th>시간</th>
            <th>과목</th>
          </tr>
        </thead>
        <tbody>
          {timetable.map((item, index) => (
            <tr key={index}>
              <td>{item.time}</td>
              <td
                style={{ backgroundColor: subjectColors[item.subject] || 'white' }}
                onClick={() => handleSubjectSelection(index)}
              >
                {item.subject}
              </td>
            </tr>
          ))}
        </tbody>
      </table>
            </div>
          </div>
          <Sidebar width={320}></Sidebar>
        </body>
        <div>
            문의 이메일 : gksrbgks713@skuniv.ac.kr
        </div>
        <footer>
          명Kay검진 &copy; <span>{thisYear()}</span>
        </footer>

      </div>
    </div>
  );
}

export default App;