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
DEPENDS += "sub-exporter-progressive-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/H/HA/HAARG/Devel-GlobalDestruction-0.12.tar.gz"

SRC_URI[md5sum] = "87382bd2f512b0703dd55da6b2b16ec4"
SRC_URI[sha256sum] = "98a5b7668fc710e4c7ebe8860508fbebeea830eab6243d21ed8d7ac293278a70"

S = "${WORKDIR}/Devel-GlobalDestruction-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
