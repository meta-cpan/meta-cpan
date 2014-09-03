DESCRIPTION = "Perl's global destruction is a little tricky to deal with WRT \
finalizers because it's not ordered and objects can sometimes \
disappear."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-GlobalDestruction"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/H/HA/HAARG/Devel-GlobalDestruction-0.13.tar.gz"

SRC_URI[md5sum] = "e7be00040827e204b2b6cba2f3166074"
SRC_URI[sha256sum] = "b29824dc0d322e56da325f05185367eb443694716010b36693dd52ffbe8ec462"
RDEPENDS_${PN} += "sub-exporter-progressive-perl"

S = "${WORKDIR}/Devel-GlobalDestruction-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
