DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the \
YAML 1.0 specification. <http://www.yaml.org/spec/>"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/YAML-1.14.tar.gz"

SRC_URI[md5sum] = "9e47c16c6d65487ef612b71f4b09ca47"
SRC_URI[sha256sum] = "6c9a4368b50cfebbbc7c69c9d78e5d4bc3dc55fbc792c1f53cde3e1dfd5c5c6b"
DEPENDS += "test-yaml-perl-native"

S = "${WORKDIR}/YAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
