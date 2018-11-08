import React, {Component} from 'react'
import {graphql} from 'react-apollo';
import gql from 'graphql-tag';
import 'whatwg-fetch';

class SpeakerList extends Component {

    render() {
        const speakers = this.props.data.speakerList;
        return <p>Loading...</p>
    }
}

export const SPEAKER_QUERY = gql`query {	speakerList(max: 10) {
    id, nome, sobrenome, nomeCompleto, email, bio,
    talks { id }
	} 
}`;

// export const SPEAKER_QUERY = gql`query {	speakerList(max: 10) {
// 	  id, firstName, lastName,
//     talks { id title, duration}
// 	}
// }`;

const SpeakerListWithData = graphql(SPEAKER_QUERY)(SpeakerList);
export default SpeakerListWithData;
