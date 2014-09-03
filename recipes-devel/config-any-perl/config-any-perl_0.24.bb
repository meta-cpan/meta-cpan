DESCRIPTION = "Config::Any provides a facility for Perl applications and libraries to \
load configuration data from multiple different file formats. It \
supports XML, \
YAML, JSON, Apache-style configuration, Windows INI files, and even \
Perl \
code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BR/BRICAS/Config-Any-0.24.tar.gz"

SRC_URI[md5sum] = "bf58a5cbd8b809886bd0459986e55ad7"
SRC_URI[sha256sum] = "710f8fc8f9414205cb58399bfbb4d9aaf7883f8ce046cee22913f6818795c61a"
RDEPENDS_${PN} += "perl"

S = "${WORKDIR}/Config-Any-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
