DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the \
YAML 1.0 specification. <http://www.yaml.org/spec/>"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IN/INGY/YAML-1.12.tar.gz"

SRC_URI[md5sum] = "e67560af33061f7148fec275d2da631c"
SRC_URI[sha256sum] = "91f33030bb95d3555e06f757eb13d96241cfc5791388695ad7e752baf92f3dc2"
DEPENDS += "test-yaml-perl-native"

S = "${WORKDIR}/YAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
