<template>
  <div id="hello">
    <h1>XMU News</h1>
    <a-layout id="list">
      <a-list item-layout="horizontal" :data-source="data">
        <a-list-item slot="renderItem" slot-scope="item, index">
          <a-list-item-meta
            :description="item.content"
          >
            <a-avatar
              slot="avatar"
              src="https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            />
            <a slot="title">{{ item.caption }}</a>
          </a-list-item-meta>
        </a-list-item>
      </a-list>
    </a-layout>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      data: [
        {
          title: 'Ant Design Title 1'
        },
        {
          title: 'Ant Design Title 2'
        },
        {
          title: 'Ant Design Title 3'
        },
        {
          title: 'Ant Design Title 4'
        }
      ]
    }
  },
  created () {
    axios.post('/news').then(response => {
        this.data = response.data;
        console.log(response)
      })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#hello {
  width: 800px;
}
#list {
  width: 100%;
}
</style>
