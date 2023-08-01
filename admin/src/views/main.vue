<template>
  <a-layout id="components-layout-demo-top-side-2">
    <this-header-view/>
    <a-layout>
      <this-sider-view/>
      <a-layout-content
          :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
      >
        <router-view></router-view>
      </a-layout-content>
    </a-layout>
  </a-layout>
</template>
<script>
import { defineComponent } from 'vue';
import ThisHeaderView from "@/components/the-header";
import ThisSiderView from "@/components/the-sider";



export default defineComponent({
  components: {
    ThisSiderView,
    ThisHeaderView,
  },
  setup() {
    return {
    };
  },
});
</script>
<style>

</style>