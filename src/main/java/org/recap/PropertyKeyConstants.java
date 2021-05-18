package org.recap;

/**
 * Created by rajeshbabuk on 15/May/2021
 */
public class PropertyKeyConstants {

    private PropertyKeyConstants() {
    }

    /* General Property Keys */
    public static final String VERSION_NUMBER = "version.number";
    public static final String EMAIL_STATUS_RECONCILIATION_TO = "email.status.reconciliation.to";
    public static final String EMAIL_STATUS_RECONCILIATION_CC = "email.status.reconciliation.cc";
    public static final String SCSB_CIRC_URL = "scsb.circ.url";
    public static final String SCSB_GATEWAY_URL = "scsb.gateway.url";
    public static final String SCSB_SOLR_DOC_URL = "scsb.solr.doc.url";
    public static final String ACTIVEMQ_BROKER_URL = "activemq.broker.url";
    public static final String ACTIVEMQ_JMX_SERVICE_URL = "activemq.jmx.service.url";
    public static final String ACTIVEMQ_JOLOKIA_API_URL = "activemq.jolokia.api.url";
    public static final String ACTIVEMQ_JOLOKIA_API_QUEUE_SIZE_ATTRIBUTE = "activemq.jolokia.api.queue.size.attribute";
    public static final String ACTIVEMQ_CREDENTIALS = "activemq.credentials";
    public static final String ACTIVEMQ_WEB_CONSOLE_URL = "activemq.web.console.url";
    public static final String SCSB_SUPPORT_INSTITUTION = "scsb.support.institution";

    /* ILS Property Keys */
    public static class ILS {
        private ILS() {
        }

        public static final String ILS_PROTOCOL = "ils.protocol";
        public static final String ILS_SERVER = "ils.server";
        public static final String ILS_SERVER_PORT = "ils.server.port";
        public static final String ILS_SERVER_OPERATOR_USER_ID = "ils.server.operator.user.id";
        public static final String ILS_SERVER_OPERATOR_PASSWORD = "ils.server.operator.password";
        public static final String ILS_SERVER_OPERATOR_LOCATION = "ils.server.operator.location";
        /* ILS OAuth Keys */
        public static final String ILS_OAUTH2_CLIENT_CLIENT_ID = "oauth2.client.clientid";
        public static final String ILS_OAUTH2_CLIENT_CLIENT_SECRET = "oauth2.client.clientSecret";
        public static final String ILS_OAUTH2_CLIENT_REGISTERED_REDIRECT_URI = "oauth2.client.registered-redirect-uri";
        public static final String ILS_OAUTH2_RESOURCE_JWT_KEY_VALUE = "oauth2.resource.jwt.key-value";
        public static final String ILS_OAUTH2_CLIENT_SCOPE = "oauth2.client.scope";
        public static final String ILS_OAUTH2_CLIENT_PRE_ESTABLISHED_REDIRECT_URI = "oauth2.client.pre-established-redirect-uri";
        public static final String ILS_OAUTH_RESOURCE_JWT_KEY_VALUE = "oauth.resource.jwt.key-value";
        public static final String ILS_OAUTH_TOKEN_API_URL = "oauth.token.api.url";
        /* ILS Email Keys */
        public static final String ILS_EMAIL_ACCESSION_REPORTS_TO = "email.accession.reports.to";
        public static final String ILS_EMAIL_ACCESSION_RECONCILIATION_TO = "email.accession.reconciliation.to";
        public static final String ILS_EMAIL_ACCESSION_RECONCILIATION_CC = "email.accession.reconciliation.cc";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_TO = "email.submit.collection.to";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_CC = "email.submit.collection.cc";
        public static final String ILS_EMAIL_MATCHING_REPORTS_TO = "email.matching.reports.to";
        public static final String ILS_EMAIL_DATA_DUMP_TO = "email.data.dump.to";
        public static final String ILS_EMAIL_DATA_DUMP_CC = "email.data.dump.cc";
        public static final String ILS_EMAIL_RECALL_REQUEST_TO = "email.recall.request.to";
        public static final String ILS_EMAIL_REQUEST_RECALL_CC = "email.request.recall.cc";
        public static final String ILS_EMAIL_REQUEST_INITIAL_LOAD_TO = "email.request.initial.load.to";
        public static final String ILS_EMAIL_REQUEST_REFILE_TO = "email.request.refile.to";
        public static final String ILS_EMAIL_ADMIN_ROLE_TO = "email.admin.role.to";
        public static final String ILS_EMAIL_TECHNICAL_SUPPORT_TO = "email.technical.support.to";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_NOFILES_TO = "email.submit.collection.nofiles.to";
        public static final String ILS_EMAIL_DELETED_RECORDS_TO = "email.deleted.records.to";
        public static final String ILS_EMAIL_SMTP_SERVER_ADDRESS_FROM = "email.smtp.server.address.from";
        public static final String ILS_EMAIL_ACCESSION_JOB_EXCEPTION_TO = "email.accession.job.exception.to";
        public static final String ILS_EMAIL_ACCESSION_JOB_EXCEPTION_CC = "email.accession.job.exception.cc";



        /* Other ILS Keys */
        public static final String ILS_DATA_DUMP_MARC = "datadump.marc";
        public static final String ILS_REST_DATA_API = "ils.rest.data.api";
        public static final String ILS_REST_POLLING_MAX_TIMEOUT = "ils.rest.polling.max.timeout";
        public static final String ILS_BIB_DATA_API_PARAMETER = "ils.bibdata.api.parameter";
        public static final String ILS_BIB_DATA_API_ENDPOINT = "ils.bibdata.api.endpoint";
        public static final String ILS_BIB_DATA_API_AUTH = "ils.bibdata.api.auth";
        public static final String ILS_BIB_DATA_FORMAT = "bibdata.format";
        public static final String ILS_REFILE_ENDPOINT_PROTOCOL = "ils.refile.endpoint.protocol";
        public static final String ILS_SUBMIT_COLLECTION_PROTECTED_FTP_DIR = "submitCollection.protected.ftpDir";
        public static final String ILS_SUBMIT_COLLECTION_PROTECTED_LOCAL_DIR = "submitCollection.protected.localDir";
        public static final String ILS_SUBMIT_COLLECTION_NOT_PROTECTED_FTP_DIR = "submitCollection.notProtected.ftpDir";
        public static final String ILS_SUBMIT_COLLECTION_NOT_PROTECTED_LOCAL_DIR = "submitCollection.notProtected.localDir";
        public static final String ILS_FTP_ACCESSION_RECONCILIATION_DIR = "ftp.accession.reconciliation.dir";
        public static final String ILS_FTP_ACCESSION_RECONCILIATION_PROCESSED_DIR = "ftp.accession.reconciliation.processed.dir";
        public static final String ILS_ACCESSION_RECONCILIATION_FILE_PATH = "accession.reconciliation.filePath";
        public static final String ILS_ACCESSION_RECONCILIATION_WORK_DIR = "accession.reconciliation.workdir";
        public static final String ILS_ACCESSION_RECONCILIATION_FTP_ROUTE_ID = "accession.reconciliation.ftp.routeId";
        public static final String ILS_ACCESSION_RECONCILIATION_DIRECT_ROUTE_ID = "accession.reconciliation.direct.routeId";
        public static final String ILS_ETL_INCREMENTAL_DUMP = "etl.incremental.dump";
        public static final String ILS_ETL_DELETED_DUMP = "etl.deleted.dump";
        public static final String ILS_ETL_INITIAL_DATA_LOADED_DATE = "etl.initial.data.loaded.date";
        public static final String ILS_FTP_REQUEST_INITIAL_ACCESSION_DIR = "ftp.request.initial.accession.dir";
        public static final String ILS_FTP_REQUEST_INITIAL_ACCESSION_ERROR_FILE = "ftp.request.initial.accession.error.file";
        public static final String ILS_REQUEST_INITIAL_LOAD_WORK_DIR = "request.initial.load.workdir";
        public static final String ILS_REQUEST_INITIAL_LOAD_FILE_PATH = "request.initial.load.filepath";
        public static final String ILS_AGENCY_ID = "ils.agency.id";
        public static final String ILS_SCHEME = "ils.scheme";
        public static final String ILS_API_KEY = "ils.api.key";
        public static final String ILS_ENABLE_CIRCULATION_FREEZE = "ils.enable.circulation.freeze";
        public static final String ILS_CIRCULATION_FREEZE_MESSAGE = "ils.circulation.freeze.message";
        public static final String ILS_S3_SUBMIT_COLLECTION_REPORT_DIR = "s3.submit.collection.report.dir";
        public static final String ILS_S3_SUBMIT_COLLECTION_DIR = "s3.submit.collection.dir";
        public static final String ILS_S3_ACCESSION_RECONCILIATION_DIR = "s3.accession.reconciliation.dir";
        public static final String ILS_S3_ACCESSION_RECONCILIATION_PROCESSED_DIR = "s3.accession.reconciliation.processed.dir";
        public static final String ILS_S3_DAILY_RECONCILIATION = "s3.daily.reconciliation";
        public static final String ILS_S3_DAILY_RECONCILIATION_PROCESSED = "s3.daily.reconciliation.processed";
        public static final String ILS_S3_ADD_S3_ROUTES_ON_STARTUP = "s3.add.s3.routes.on.startup";
        public static final String ILS_SCSBBUCKETNAME = "scsbBucketName";
        public static final String ILS_ACCESSION_RECONCILIATION_FILEPATH = "accession.reconciliation.filePath";
        public static final String ILS_DAILY_RECONCILIATION_FILE = "daily.reconciliation.file";
        public static final String ILS_SUBMIT_COLLECTION_LOCAL_DIR = "submit.collection.local.dir";
        public static final String ILS_AWSACCESSKEY = "awsAccessKey";
        public static final String ILS_AWSACCESSSECRETKEY = "awsAccessSecretKey";
        public static final String ILS_BIBDATA_API_CONNECTION_TIMEOUT = "bibdata.api.connection.timeout";
        public static final String ILS_BIBDATA_API_READ_TIMEOUT = "bibdata.api.read.timeout";
        public static final String ILS_STATUS_RECONCILIATION_BATCH_SIZE = "status.reconciliation.batch.size";
        public static final String ILS_STATUS_RECONCILIATION_DAY_LIMIT = "status.reconciliation.day.limit";
        public static final String ILS_STATUS_RECONCILIATION_BARCODE_LIMIT = "status.reconciliation.barcode.limit";
        public static final String ILS_PURGE_EMAIL_ADDRESS_EDD_REQUEST_DAY_LIMIT = "purge.email.address.edd.request.day.limit";
        public static final String ILS_PURGE_EMAIL_ADDRESS_PHYSICAL_REQUEST_DAY_LIMIT = "purge.email.address.physical.request.day.limit";
        public static final String ILS_PURGE_EXCEPTION_REQUEST_DAY_LIMIT = "purge.exception.request.day.limit";
        public static final String ILS_PURGE_ACCESSION_REQUEST_DAY_LIMIT = "purge.accession.request.day.limit";
        public static final String ILS_SUBMIT_COLLECTION_INPUT_LIMIT = "submit.collection.input.limit";
        public static final String ILS_SUBMIT_COLLECTION_PARTITION_SIZE = "submit.collection.partition.size";
        public static final String ILS_NONHOLDINGID_INSTITUTION = "nonholdingid.institution";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_SUBJECT = "email.submit.collection.subject";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_SUBJECT_FOR_EMPTY_DIRECTORY = "email.submit.collection.subject.for.empty.directory";
        public static final String ILS_EMAIL_SMTP_SERVER = "email.smtp.server";
        public static final String ILS_EMAIL_SMTP_SERVER_USERNAME = "email.smtp.server.username";
        public static final String ILS_EMAIL_REQUEST_RECALL_SUBJECT = "email.request.recall.subject";
        public static final String ILS_EMAIL_SMTP_SERVER_PASSWORD_FILE = "email.smtp.server.password.file";
        public static final String ILS_ONGOING_ACCESSION_INPUT_LIMIT = "ongoing.accession.input.limit";
        public static final String ILS_STATUS_RECONCILIATION = "status.reconciliation";
        public static final String ILS_BATCH_ACCESSION_THREAD_SIZE = "batch.accession.thread.size";

    }

    /* IMS Property Keys */
    public static class IMS {
        private IMS() {
        }

        /* IMS End Point URL Keys */
        public static final String IMS_SERVER_STATUS_ENDPOINT = "ims.server.status.endpoint";
        public static final String IMS_ITEM_STATUS_ENDPOINT = "ims.item.status.endpoint";
        public static final String IMS_ITEM_PERMANENT_WITHDRAWAL_DIRECT_ENDPOINT = "ims.item.permanent.withdrawal.direct.endpoint";
        public static final String IMS_ITEM_PERMANENT_WITHDRAWAL_INDIRECT_ENDPOINT = "ims.item.permanent.withdrawal.indirect.endpoint";
        public static final String IMS_ITEM_RETRIEVAL_ORDER_ENDPOINT = "ims.item.retrieval.order.endpoint";
        public static final String IMS_ITEM_EDD_ORDER_ENDPOINT = "ims.item.edd.order.endpoint";
        /* IMS Email Keys */
        public static final String IMS_EMAIL_REQUEST_CANCEL_TO = "ims.email.request.cancel.to";
        public static final String IMS_EMAIL_REQUEST_REFILE_TO = "ims.email.request.refile.to";
        public static final String IMS_EMAIL_REQUEST_RECALL_CC = "ims.email.request.recall.cc";
        public static final String IMS_EMAIL_ASSIST_TO = "ims.email.assist.to";
        public static final String IMS_EMAIL_DAILY_RECONCILIATION_TO = "ims.email.daily.reconciliation.to";
        public static final String IMS_EMAIL_STATUS_RECONCILIATION_TO = "ims.email.status.reconciliation.to";
        public static final String IMS_EMAIL_STATUS_RECONCILIATION_CC = "ims.email.status.reconciliation.cc";
        /* Other IMS Keys */
        public static final String IMS_USE_QUEUE = "ims.use.queue";
        public static final String IMS_SERVER_RESPONSE_TIMEOUT_MILLISECONDS = "ims.server.response.timeout.milliseconds";
        public static final String IMS_POLLING_TIME_INTERVAL = "ims.polling.time.interval";
        public static final String IMS_AVAILABLE_ITEM_STATUS_CODES = "ims.available.item.status.codes";
        public static final String IMS_NOT_AVAILABLE_ITEM_STATUS_CODES = "ims.not.available.item.status.codes";
    }
}
