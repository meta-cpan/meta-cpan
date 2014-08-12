DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. \
Most or all of this information can be found in other ways, but they \
aren't always \
very friendly, and usually involve a relatively high level of Perl \
wizardry, \
or strange and unusual looking code. Class::Inspector attempts to \
provide an \
easier, more friendly interface to this information."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Inspector"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Class-Inspector-1.28.tar.gz"

SRC_URI[md5sum] = "7ab3ca22d3147236dddfb58f2366ad22"
SRC_URI[sha256sum] = "3ca4b7a3ed1f4cc846c9a3c08f9a6e9ec07a9cbfd92510dea9513db61a923112"
DEPENDS += "perl"

S = "${WORKDIR}/Class-Inspector-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
