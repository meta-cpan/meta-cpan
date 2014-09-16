DESCRIPTION = "Works together with MooX::Options for every command on its own, so \
options are parsed for the specific context and used for the \
instantiation:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Cmd-0.009.tar.gz"

SRC_URI[md5sum] = "adc5b8ba2ff7659196d4babaa3a876b3"
SRC_URI[sha256sum] = "0e165338b8efce34de1489458b4a98987b91b6ff2318b6016b225b26cff72a7b"
RDEPENDS_${PN} += "io-tiecombine-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "regexp-common-perl"

S = "${WORKDIR}/MooX-Cmd-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
