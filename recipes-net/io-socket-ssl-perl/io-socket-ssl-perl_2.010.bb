DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the \
necessary functionality into the familiar IO::Socket interface and providing \
secure defaults whenever possible. This way existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and don't use \
select or poll."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-SSL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.010.tar.gz"

SRC_URI[md5sum] = "69cad2edebf89c6c295fe8778a4f9906"
SRC_URI[sha256sum] = "68491ad58eb28645ca1272657e9c77c4c8ae4a11d35fb630ead4b6157079503c"
RDEPENDS_${PN} += "net-ssleay-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
