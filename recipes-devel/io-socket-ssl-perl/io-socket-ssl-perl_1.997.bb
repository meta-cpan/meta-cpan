DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the \
necessary functionality into the familiar IO::Socket interface and \
providing secure \
defaults whenever possible. This way existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and \
don't use \
select or poll."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-SSL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-1.997.tar.gz"

SRC_URI[md5sum] = "2a6268bb42da81e69d1c1feb2fcb0eea"
SRC_URI[sha256sum] = "acdb67b5b63aea5b7e70c3e4c70a16128810329592b63753a38c794aff76a1dd"
RDEPENDS_${PN} += "net-ssleay-perl"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
