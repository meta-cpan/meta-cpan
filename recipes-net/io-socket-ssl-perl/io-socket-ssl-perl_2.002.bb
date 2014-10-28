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

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.002.tar.gz"

SRC_URI[md5sum] = "3b0753495a1ff043bd782a6b876d990f"
SRC_URI[sha256sum] = "684960c47634334577b6d94ac2ca34f7a2f829058057e43821bb74c3a928f0d6"
RDEPENDS_${PN} += "net-ssleay-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
