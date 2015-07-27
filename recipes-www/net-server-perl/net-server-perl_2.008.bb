DESCRIPTION = ""Net::Server\" is an extensible, generic Perl server engine."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RH/RHANDOM/Net-Server-2.008.tar.gz"

SRC_URI[md5sum] = "85d488bc800f582839dd924ffa3f0d26"
SRC_URI[sha256sum] = "0921056aedc871a59c4b76f58764f0e0a16c1816b58c366a9d80e46367744fa0"

S = "${WORKDIR}/Net-Server-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
