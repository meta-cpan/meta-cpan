DESCRIPTION = "This module is intended to easy load initialization values for \
attributes on object construction from an appropriate config file. The \
building is done in \
MooX::ConfigFromFile::Role - using MooX::ConfigFromFile ensures the \
role is \
applied."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-ConfigFromFile"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-ConfigFromFile-0.003.tar.gz"

SRC_URI[md5sum] = "fd6cfde23c66b201970a2f252aae172d"
SRC_URI[sha256sum] = "835bcc117b3c8d345f5ccd73f7f0cfa2186011adf80a871eb859c6c333225562"
RDEPENDS_${PN} += "file-find-rule-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-file-configdir-perl"
DEPENDS += "json-perl-native"

S = "${WORKDIR}/MooX-ConfigFromFile-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
