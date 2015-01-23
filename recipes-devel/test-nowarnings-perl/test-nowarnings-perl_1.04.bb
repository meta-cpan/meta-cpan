DESCRIPTION = "In general, your tests shouldn't produce warnings. This modules causes \
any warnings to be captured and stored. It automatically adds an extra test \
that will run when your script ends to check that there were no warnings. If \
there were any warings, the test will give a \"not ok\" and diagnostics of \
where, when and what the warning was, including a stack trace of what was \
going on when the it occurred."

SECTION = "libs"
LICENSE = "LGPL-2.1"
PR = "r1"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-NoWarnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Test-NoWarnings-1.04.tar.gz"

SRC_URI[md5sum] = "682ed043f7d3e38f3dfd8745fd21c49a"
SRC_URI[sha256sum] = "638a57658cb119af1fe5b15e73d47c2544dcfef84af0c6b1b2e97f08202b686c"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Test-NoWarnings-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
