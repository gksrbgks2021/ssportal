import React, {useEffect, useRef, useState } from "react";
import styles from "./sidebar.module.css";
import menu from "./image/menu.png"


const Sidebar = ({ width=280, children }) => {
  const [isOpen, setOpen] = useState(false);
  const [xPosition, setX] = useState(-width);
  const side = useRef();
  
  // button 클릭 시 토글
  const toggleMenu = () => {
    if (xPosition < 0) {
      setX(0);
      setOpen(true);
    } else {
      setX(-width);
      setOpen(false);
    }
  };
  
  // 사이드바 외부 클릭시 닫히는 함수
  const handleClose = async e => {
    let sideArea = side.current;
    let sideCildren = side.current.contains(e.target);
    if (isOpen && (!sideArea || !sideCildren)) {
      await setX(-width); 
      await setOpen(false);
    }
  }

  useEffect(()=> {
    window.addEventListener('click', handleClose);
    return () => {
      window.removeEventListener('click', handleClose);
    };
  })


  return (
    <div className={styles.container}>
      <div ref={side}  className={styles.sidebar} style={{ width: `${width}px`, height: '100%',  transform: `translatex(${-xPosition}px)`}}>
          <button onClick={() => toggleMenu()}
          className={styles.button} >
            {isOpen ? 
            <span>X</span> : <img src={menu} alr="contact open button" className={styles.openBtn}/>
            }
          </button>
        <div className={styles.content}>{children}</div>
        <nav>
            <ul className="header-wrapper">
              <li><a href="https://www.skuniv.ac.kr/main">학교 홈페이지 바로가기</a></li>
              <li><a href="https://www.skuniv.ac.kr/notice">학교 공지사항 바로가기</a></li>
              <li><a href="https://www.skuniv.ac.kr/academic_calendar">학사일정 바로가기</a></li>
              <li><a href="#"><input type="text" name="search" placeholder="검색어를 입력하세요" autoComplete='off'/></a></li>
            </ul>          
          </nav>
      </div>
    </div>
  );
};


export default Sidebar;


/*1.  props 매개변수의 width에 기본값 280을 설정해둠으로써 오류를 일차 방지합니다.

2. 외부 클릭시 닫히는 함수를 원하지 않는다면  handleClose, useEffect(()=> {widow.addEventListener..}) 두 부분을 삭제하고 사용하시면 됩니다.

3. 컴포넌트가 사용되는 위치에서 자식요소로 들어가있던 데이터가 {children} 위치로 구현됩니다.  */