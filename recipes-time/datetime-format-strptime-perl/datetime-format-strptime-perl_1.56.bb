DESCRIPTION = "This module implements most of strptime(3), the POSIX function that is \
the reverse of strftime(3), for \"DateTime\". While \"strftime\" takes \
a \"DateTime\" \
and a pattern and returns a string, \"strptime\" takes a string and a \
pattern \
and returns the \"DateTime\" object associated."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Format-Strptime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Format-Strptime-1.56.tar.gz"

SRC_URI[md5sum] = "c8c1ca4e56160179e5c67b1d622320e9"
SRC_URI[sha256sum] = "2ff69d0f5a0359aab04e7276db5bee3be10040da24fbf09de1d904e7ead78b28"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "params-validate-perl"
RECOMMENDS += "perl"

S = "${WORKDIR}/DateTime-Format-Strptime-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
